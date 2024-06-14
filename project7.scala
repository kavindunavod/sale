
object project7 {

  def main(args: Array[String]) : Unit = {
  calculate();

  }

  def calculate(): Unit = {
    val price = 24.95;
    val discount = 0.4;
    val book = 60;
    val shipping_cost = 3 + 0.75 * 10;
    val quantity = 60;
    val total = (quantity * price) * discount + shipping_cost;
    val rounded = (math.round(total * 100.0) / 100.0)
    println(rounded);

  }

}
