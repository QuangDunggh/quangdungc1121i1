class Phone {
    constructor(id, name, catetory, quanlity, price) {
        this.id = id;
        this.name = name;
        this.catetory = catetory;
        this.quanlity = quanlity;
        this.price = price;
    }
}
class CartItem {
    constructor(name, quanlity, price, totalPrice, id) {
        this.name = name;
        this.quanlity = quanlity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.id = id;
    }
}
let iphone8 = new Phone(0, 'iphone8', 'IOS', 30, 600);
let iphone9 = new Phone(1, 'iphone9', 'IOS', 30, 700);
let iphoneX = new Phone(2, 'iphoneX', 'IOS', 30, 800);
let glaxyS7 = new Phone(3, 'glaxyS7', 'Android', 30, 500);
let glaxyS8 = new Phone(4, 'glaxyS8', 'Android', 30, 600);
let glaxyS9 = new Phone(5, 'glaxyS9', 'Android', 30, 900);
let xiaomi1 = new Phone(6, 'xiaomi1', 'Android', 30, 400);
let xiaomi2 = new Phone(7, 'xiaomi2', 'Android', 30, 500);
let xiaomi3 = new Phone(8, 'xiaomi3', 'Android', 30, 900);
//console.log(iphone8)
let phones = [iphone8, iphone9, iphoneX, glaxyS7, glaxyS8, glaxyS9, xiaomi1, xiaomi2, xiaomi3];
let cart = [];

function showPhone(data) {
    let length = data.length;
    let tablePhone = '';

    for (let i = 0; i < length; i++) {
        tablePhone += `<tr>
          <td>${data[i].id}</td>
          <td>${data[i].name}</td>
          <td>${data[i].catetory}</td>
          <td>${data[i].quanlity}</td>
          <td>${data[i].price}</td>
          <td><input type='number' id='number${i}' required min = 0></td>
          <td><input type="button" class="btn btn-outline-primary" value='Get' onclick='getphone(${i})'></td>
          </tr>`;
    }
    tablePhone += `'<tr>      
      <td colspan=4><input type=text value='Tổng sản phẩm hiện có:' disabled></td>
      <td></td>
      <tr>
      </table>`;
    document.getElementById('displayProduct').innerHTML = tablePhone;
}

function search() {
    let keyword = document.getElementById("keyword").value;
    let searchResult = phones.filter(function (phone, index) {
        return phone.name.toLowerCase().indexOf(keyword.toLowerCase()) != -1;
    })
    showPhone(searchResult);
}


function getphone(index) {
    let chosenPhone = document.getElementById(`number${index}`).value;
    if (chosenPhone > phones[index].quanlity) {
        alert('Số lượng sản phẩm không đủ không đủ!!!');
        return;
    }
    phones[index].quanlity -= chosenPhone;
    let cartItem = new CartItem(phones[index].name, chosenPhone, phones[index].price, phones[index].price *
        chosenPhone, index);
    cart.push(cartItem);
    window.localStorage.setItem("cart", JSON.stringify(cart));
    document.getElementById("cartInfo").innerHTML = `<a target="blank" href='home.html'>Cart(${cart.length})</a>`
    
    showPhone(phones);
}

function changeSL(index) {
    let chosenPhone = Number(document.getElementById(`num${index}`).value);
    if (chosenPhone > phones[index].quanlity) {
        return;
    }
    let pricePhone = Number(document.getElementById(`price${index}`).value);
    let result = chosenPhone * pricePhone;
    document.getElementById(`totalPrice${index}`).value = result ;
}

(function () {
    showPhone(phones);
    
})()