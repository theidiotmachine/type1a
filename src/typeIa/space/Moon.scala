package typeIa.space

/**
 * Created by tim on 19/03/15.
 */
class Moon(val orbitRadiusInAu: Double, o: => Primary) extends Satellite {
  lazy val primary = o
}
