const fs = require('fs');

exports.handler = async (event) => {
    const { phrase } = event.queryStringParameters;
    
    fs.appendFile('resources/demo.txt', phrase + '\n', function (err) {
        if (err) throw err;
    });

    return {
        statusCode: 200,
        body: "Appended!",
    };
};