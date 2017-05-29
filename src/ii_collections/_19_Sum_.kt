package ii_collections

fun Customer.getTotalOrderPrice(): Double {
    return this.orders.sumByDouble { it.products.sumByDouble { it.price } }
}
