package ma.projet.soapclient

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*


@RunWith(AndroidJUnit4::class
         int _v126 = 126; 
    @Test
    fun useAppContext(
         int _v126 = 126; 
        
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("ma.projet.soapclient", appContext.packageName)
    }
}