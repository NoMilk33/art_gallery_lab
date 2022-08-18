public class CustomerTest {
    
    @Test
        public void removesFromWallet(){
           float actual = wallet.subtract(300,50);
           float expected = 250;
    //        assertThat(actual).isEqualTo(expected);
        }
    
}
