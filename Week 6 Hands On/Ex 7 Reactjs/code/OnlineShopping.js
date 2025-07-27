import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
    constructor() {
        super();
        this.state = {
            cartItems: [
                {itemname: "Laptop", price: 80000},
                {itemname: "TV", price: 120000},
                {itemname: "Washing Machine", price: 50000},
                {itemname: "Mobile", price: 30000},
                {itemname: "Fridge", price: 70000}
            ]
        };
    }

    render() {
        return (
            <div className="my-shop">
                <h1>Items Ordered:</h1>
                {this.state.cartItems.map((item, index) => (
                    <Cart key={index} itemname={item.itemname} price={item.price} />
                ))}
            </div>
        );
    }
}

export default OnlineShopping;
