import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_divisibleBy3_ping() {
    PingPong testPingPong = new PingPong();
    assertEquals("ping", testPingPong.pingPongMethod(3));
  }


  @Test
  public void isPingPong_divisibleBy5_pong(){
    PingPong testPingPong = new PingPong();
    assertEquals("pong", testPingPong.pingPongMethod(5));
  }

  @Test
  public void isPingPong_divisibleBy15_pingpong(){
    PingPong testPingPong = new PingPong();
    assertEquals("ping-pong", testPingPong.pingPongMethod(15));
  }

}
