object FirstProgram:
  def performance_bonus(x:Int) = {
    def m(): Float = 1.2f
    
    val multiplier = m()
    x * multiplier
  }

  @main def runMain_FirstProgram(): Unit =
    println(performance_bonus(3))
