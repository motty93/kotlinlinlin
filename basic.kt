/* 関数の定義 */
fun sum(a: Int, b: Int): Int {
  return a + b
}

/* 式本体と推論された戻り値の型を持つ関数 */
fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
  print(a + b)
}

/* Unit型の戻り値は省略できる */
fun printSum(a: Int, b: Int) {
  print(a + b)
}


/* ローカル変数の定義 */
val a: Int = 1
val b = 1
val c: Int
c = 1

var x = 5
x += 1


/* 文字列テンプレートの使用 */
fun main(args: Array<String>) {
  if (args.size == 0) return

    print("First argument: ${args[0]}")
}


/* 条件式の使用 */
fun max(a: Int, b: Int): Int {
  if (a > b)
    return a
  else
    return b
}

fun max(a: Int, b: Int) = if (a > b) a else b


/* NULL可能値を使用したnullチェック */
fun parseInt(str: String): Int? {
}

fun main(args: Array<String>) {
  if (args.size < 2) {
    print("Two integers expected")
    return
  }

  val x = parseInt(args[0])
  val y = parseInt(args[1])

  /* x,yはnullが入っていることがあるので、x * yはエラーを引き起こす */
  if (x != null && y != null) {
    /* x,yはnullチェックのあと自動的に非null許容型へキャストされる */
    print(x * y)
  }
}

