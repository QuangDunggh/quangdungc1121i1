class Phone {
    constructor(name, catetory, quanlity, price, aim) {
        this.name = name;
        this.catetory = catetory;
        this.quanlity = quanlity;
        this.price = price;
        this.aim = aim;
    }
}
let iphone8 = new Phone('iphone8', 'IOS', 30, 600, 'For work');
let iphone9 = new Phone('iphone9', 'IOS', 30, 600, 'To play');
let iphoneX = new Phone('iphoneX', 'IOS', 30, 600, 'For work');
let glaxyS7 = new Phone('glaxyS7', 'Android', 30, 600, 'To play');
let glaxyS8 = new Phone('glaxyS8', 'Android', 30, 600, 'For work');
let glaxyS9 = new Phone('glaxyS9', 'Android', 30, 600, 'To play');
let xiaomi1 = new Phone('xiaomi1', 'Android', 30, 600, 'To play');
let xiaomi2 = new Phone('xiaomi2', 'Android', 30, 600, 'To play');
let xiaomi3 = new Phone('xiaomi3', 'Android', 30, 600, 'For work');
//console.log(iphone8)
let phones = [iphone8, iphone9, iphoneX, glaxyS7, glaxyS8, glaxyS9, xiaomi1, xiaomi2, xiaomi3];

function showPhone(data) {
    let length = data.length;
    let tablePhone = '';
    tablePhone += '<table border=1>';
    tablePhone += `<tr>
    <th>Product Name</th>
    <th>Catetory</th>
    <th>Quanlity</th>
    <th>Price</th>
    <th>Aim</th>
    </tr>`
    for (let i = 0; i < length; i++) {
        tablePhone += '<tr>'
        tablePhone += `<td>${data[i].name}</td>`
        tablePhone += `<td>${data[i].catetory}</td>`
        tablePhone += `<td>${data[i].quanlity}</td>`
        tablePhone += `<td>${data[i].price}</td>`
        tablePhone += `<td>${data[i].aim}</td>`
        tablePhone += `<td><input type='number' id='number${i}'></td>`
        tablePhone += `<td><input type='button' value='Get' onclick='getphone(${i})'></td>`
        tablePhone += `<td><input type='button' value='Tra lai' id='tra'></td>`
        tablePhone += '</tr>';
    }
    tablePhone += '<tr>';
    tablePhone += `<td colspan='2'></td>`
    tablePhone += `<td>Total:</td>`
    tablePhone += `<td>Sum:</td>`
    tablePhone += `<td></td>`
    tablePhone += '<tr>';
    tablePhone += '</table>';
    document.getElementById('displayProduct').innerHTML = tablePhone;
}


function search() {
    let keyword = document.getElementById("keyword").value;
    let searchResult = phones.filter(function (phone, index) {
        return phone.name.toLowerCase().indexOf(keyword.toLowerCase()) != -1;
    })
    showPhone(searchResult);
}

function showCustomer(sanPham) {
    sanPham = [];
    let len = sanPham.length;
    let tableCustomer = '';
    tableCustomer += '<table border=1>';
    tableCustomer += '<tr>';
    tableCustomer += `<td>Tên sản phẩm vừa chọn</td>`;
    tableCustomer += `<td>Số lượng</td>`;
    tableCustomer += `<td>Giá tiền</td>`;
    tableCustomer += '</tr>';
    for (let i = 0; i < len; i++) {
        tableCustomer += '<tr>'
        for (let i = 0; i < len; i++) {
            tableCustomer += `<td>${sanPham[i]}</td>`
            // tableCustomer += `<td></td>`
            // tableCustomer += `<td></td>`
        }
        tableCustomer += '</tr>'
    }
    tableCustomer += '</table>'
    document.getElementById('showCustomer').innerHTML = tableCustomer
}

function getphone(index) {
    let chosenPhone = document.getElementById(`number${index}`).value;
    let arr = [];
    arr.push(phones[index].name, chosenPhone, phones[index].price);
    showCustomer(arr)
}



(function () {
    showPhone(phones);
})();

(function () {
    showCustomer();
})()