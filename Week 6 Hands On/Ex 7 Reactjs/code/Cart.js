import React from 'react';

class Cart extends React.Component {
    render() {
        return (
            <div>
                <h3>Item: {this.props.itemname}</h3>
                <h3>Price: {this.props.price}</h3>
                <hr />
            </div>
        );
    }
}

// Default props in case they're not provided
Cart.defaultProps = {
    itemname: "No Item",
    price: 0
};

export default Cart;
