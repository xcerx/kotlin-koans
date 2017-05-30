package iii_conventions

import util.TODO


class Invokable(var count: Int = 0)

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change class Invokable to count the number of invocations (round brackets).
        Uncomment the commented code - it should return 4.
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int {
//    todoTask31()
    return invokable()()()().getNumberOfInvocations()
}

operator fun Invokable.invoke(): Invokable {
    return Invokable(count+1)
}

fun Invokable.getNumberOfInvocations(): Int {
    return this.count
}