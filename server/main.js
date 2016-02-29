function say(word)
{
	console.log(word);
}

var options = {
	host: 'www.google.com',
	port: 80,
	path:'/home/node/log',
	method: 'GET'
};

var nl = "\n"

var http = require("http");

http.createServer(function(req, res) {
	say("----- request incoming -----" + nl);
	say('HEADERS: ' + JSON.stringify(req.headers) + nl);
	req.on('data', function(chunk) {
		say('BODY: ' + chunk + nl);
	});
	res.writeHead(200);
	res.end();
}).listen(80);

/*
http.createServer(function(request, response)
{
	response.writeHead(200, {"Content-type": "text/plain"});
	response.end();
}).listen(80);*/