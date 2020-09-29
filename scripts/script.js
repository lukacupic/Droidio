/**
 * Cached array of phrases.
 */
var phrases;

/**
 * Generates a new SW phrase.
 */
function generate() {
    var phrase = phrases[getRandomInt(phrases.length - 1)];
    document.getElementById("phrase").innerHTML = "<h2>" + phrase + "</h2>"
}

/**
 * Returns a random integer between 0 and max (exclusive).
 * @param {the range in which to return a random number} max 
 */
function getRandomInt(max) {
    return Math.floor(Math.random() * max);
}

/**
 * Loads the file containing SW phrases.
 * Called only on the first page load.
 */
function loadFile() {
    var xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            phrases = parseLines(this.responseText);
        }
    }

    xhttp.open("GET", "resources/data.txt", true);
    xhttp.send();
}

/**
 * Splits the given text into an array of lines and returns the array.
 * @param {the original unparsed text} text 
 */
function parseLines(text) {
    return text.split(/\r\n|\r|\n/);
}