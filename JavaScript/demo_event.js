var events = require('events');
var eventEmitter = new events.EventEmitter();

//이벤트 실행 로직
var myEventHandler = function () {
  console.log('I hear a scream!');
}

//이벤트명 매칭 및 로직 매칭
eventEmitter.on('scream', myEventHandler);

//이벤트 발생시키기
eventEmitter.emit('scream');