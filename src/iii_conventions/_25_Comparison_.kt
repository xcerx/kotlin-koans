package iii_conventions

fun task25(date1: MyDate, date2: MyDate): Boolean {
    return date1 < date2
}

operator fun MyDate.compareTo(other: MyDate): Int {

    if (this.year == other.year &&
            this.month == other.month &&
            this.dayOfMonth == other.dayOfMonth) {
        return 0
    }

    if (this.year >= other.year) {
        if (this.month >= other.month) {
            if (this.dayOfMonth >= other.dayOfMonth) {
                return 1
            } else {
                return -1
            }
        } else {
            return -1
        }
    } else {
        return -1
    }
}



