package model;

/**
 * Speed class.
 *
 * @author 09x3086
 */
public class Speed {

  private Long speed;

  /**
   * Constructor.
   *
   * @param space Space
   * @param time  Time
   */
  public Speed(Space space, Time time) {
    this.speed = space.getSpace() / time.getTime();
  }
}
