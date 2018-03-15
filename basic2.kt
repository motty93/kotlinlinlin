/* 型チェックと自動キャストの使用 */
fun getStringLength(obj: Any): Int? {
  if (obj is Stging) {
    /* objはこのブランチ内ではお自動的にStringへキャストされる */
    return obj.length
  }

  /* objは型チェックが行われたブランチ外ではまだAny型 */
  return null
}

fun getStringLength(obj: Any): Int? {
  if (obj !is String)
    return null

  /* objはこのブランチ内では自動的にStringへキャストされる */
  return obj.length
}

fun getStringLength(obj: Any): Int? {
  /* objは&&の右側では自動的にStringへキャストされる */
  if (obj id String && obj.length > 0)
    return obj.length

  return null
}

/* forループ */
fun main(args: Array<String>) {
  for (arg in args)
    print(arg)
}

for (i in args.indices)
  print(args[i])


/* whileループ */
fun main(args: Array<String>) {
  var i = 0
  while (i < args.size)
    print(args[i++])
}

/* when式 */
fun main(obj: Any) {
  when (obj) {
    1           -> print("one")
    "Hello"     -> print("greeting")
    is Long     -> print("Long")
    !is String  -> print("not a string")
    else        -> print("Unknown")
  }
}
