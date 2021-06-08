import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeEach
    void setUp(){
        Configuration.startMaximized = true;
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    void dragAndDroptest2(){
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));

    }
}
