
function addition(){
    let number1 = Number(document.getElementById('one').value);
    let number2 = Number(document.getElementById('two').value);
    document.getElementById('result').innerText = 'Result addition:' + (number1 + number2);
}
function subtraction(){
    let number1 = Number(document.getElementById('one').value);
    let number2 = Number(document.getElementById('two').value);
    document.getElementById('result').innerText = 'Result subtraction:' + (number1 - number2);
}
function multiplication(){
    let number1 = Number(document.getElementById('one').value);
    let number2 = Number(document.getElementById('two').value);
    document.getElementById('result').innerText = 'Result multiplication:' + number1*number2;
}
function division(){
    let number1 = Number(document.getElementById('one').value);
    let number2 = Number(document.getElementById('two').value);
    document.getElementById('result').innerText = 'Result division: ' + number1/number2;
}


