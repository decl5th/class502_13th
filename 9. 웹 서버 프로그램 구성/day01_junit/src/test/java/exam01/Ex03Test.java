package exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Ex03Test {

    @TempDir
    private File tempDir;

    @Test
    void test1() {
        String path = tempDir.getAbsolutePath();
        System.out.println(path);
    }

    @Test
    //@Timeout(3) // 3초 내에 수행이 되면 테스트 통과
    @Timeout(value = 2500, unit = TimeUnit.MILLISECONDS) // 2.5초
    void test2 () throws Exception {
        Thread.sleep(2000);
        // 타임아웃에 설정된 시간내에 지연된 시간 설정 시 테스트 통과 설정 시간이 넘어가면 테스트 실패 에러 발생
    }
}
