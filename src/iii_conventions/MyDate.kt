package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange {
    return DateRange(this, other)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {

    operator fun contains(date: MyDate): Boolean {
        return date >= start && date <= endInclusive
    }

    operator fun iterator(): Iterator<MyDate> {
        return DateRangeIterator(start, endInclusive)
    }

}

class DateRangeIterator(var start: MyDate, val endInclusive: MyDate) : Iterator<MyDate> {

    override fun hasNext(): Boolean {
        return start <= endInclusive
    }

    override fun next(): MyDate {
        val now = start
        start = start.nextDay()
        return now
    }

}
