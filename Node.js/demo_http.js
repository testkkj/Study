var http = require('http');

//서버객체 생성
http.createServer(function (req, res) {
  res.write('Hello World!'); //클라이언트에게 보낼 응답 작성
  res.end(); //응답 종료
}).listen(8080); //서버객체가 8080포트로 들어오는 요청을 수신