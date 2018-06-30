package com.silmood.ciph;

import android.widget.Button;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityRoboelectricTest {

    @Test
    public void clickingButton_shouldShowErrorMessage() throws Exception{
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        Button cipher = activity.findViewById(R.id.btn_cipher);
        EditText input = activity.findViewById(R.id.input_message);
        cipher.performClick();
        assertEquals("Message Empty", input.getError().toString());
    }
}
