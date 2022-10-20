import com.likelion.practice.exercise1019.Stack02;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stack02Test {
    Stack02 st = new Stack02();

    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pop이 잘되는지")
    void pushAndPop() {
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }
}