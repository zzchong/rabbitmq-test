import com.zzc.www.App;
import com.zzc.www.send.Send;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pc on 2017/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class RabbitmqTest {

    @Autowired
    private Send send ;

    @Test
    public void hello(){
        send.send();
    }
}
