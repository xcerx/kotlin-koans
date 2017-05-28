package ii_collections

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

fun Shop.getSetOfCustomers(): Set<Customer> {
    return this.customers.toSet()
}

