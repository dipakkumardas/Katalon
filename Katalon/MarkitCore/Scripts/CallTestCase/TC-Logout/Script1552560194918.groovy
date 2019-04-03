import com.kms.katalon.core.annotation.TearDown

@TearDown
void TearDown() {
    CustomKeywords.'helper.logout.Logout.LogoutDetails'()
}

