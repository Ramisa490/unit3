package framework.utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

@UtilityClass
public class FileUtil {

    public static boolean isFileExist(File file) {
        try
        {
            Awaitility.await().atMost(SettingsTestData.getEnvData().getWait(), TimeUnit.SECONDS).until(file::exists);
        }
        catch (ConditionTimeoutException exception)
        {
            return false;
        }
        return true;
    }

    public static void deleteFileIfExist(File file)
    {
        if (file.exists())
        {
            file.delete();
        }
    }
}
