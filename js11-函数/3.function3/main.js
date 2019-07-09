
function alphabetSort(message){
    // wirte your code here
    var a = [];
    for(var len = message.length,i=len;i>=0;i-- ){
    a.push(message[i]);
    }
    return a.join('');
  }
  alphabetSort('hello'); 