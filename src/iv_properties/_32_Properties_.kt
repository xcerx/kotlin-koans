package iv_properties

class PropertyExample() {
    var property = 0
    var counter = 0
    var propertyWithCounter: Int?
        get() = property
        set(value) {
            property = value as Int
            counter += 1
        }
}
