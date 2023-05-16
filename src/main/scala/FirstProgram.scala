object FirstProgram:
  def performance_bonus(x:Int) = {
    val multiplier = 1.2f
    x * multiplier
  }

  @main def runMain_FirstProgram(): Unit =
    println(performance_bonus(3))
