package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    return customers.filter { it.orders.any { it.products.contains(product) } }.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.flatMap { if(it.isDelivered) it.products else emptyList() }.maxBy { it.price }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap { it.orders }.flatMap { it.products }.count { it == product }
}
