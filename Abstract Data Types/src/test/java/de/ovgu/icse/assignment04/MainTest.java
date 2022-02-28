package de.ovgu.icse.assignment04;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MainTest {
    @Test
    public final void isPalindromeTest() {
        assertTrue(Main.isPalindrome("Hannah"));
        assertTrue(Main.isPalindrome("Madam, Im Adam"));
        assertTrue(Main.isPalindrome("Rotator"));                         
        assertTrue(Main.isPalindrome("Dammit, Im mad!"));
        assertTrue(Main.isPalindrome("Rats live on no evil star."));
        assertTrue(Main.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(Main.isPalindrome("A man, a plan, a canal: Panama."));            
        assertTrue(Main.isPalindrome("No lemon, no melon."));
        
        assertTrue(Main.isPalindrome("Reliefpfeiler"));
        assertTrue(Main.isPalindrome("Die Liebe ist Sieger, stets rege ist sie bei Leid."));
        assertTrue(Main.isPalindrome("Erika feuert nur untreue Fakire."));
        assertTrue(Main.isPalindrome("O Genie, der Herr ehre dein Ego!"));
        assertTrue(Main.isPalindrome("Dienstmannamtsneid"));
        assertTrue(Main.isPalindrome("Reittier"));
        assertTrue(Main.isPalindrome("Lagerregal"));
        assertTrue(Main.isPalindrome("Rentner"));
        
        assertFalse(Main.isPalindrome("This is no palindrome"));
    }
}
