package mip.mva.sp.comm.web;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class YourServiceTest {

	@Test
	void test() {
		//fail("Not yet implemented");

	    // 1. Biz-SP 환경 설정 로드
	    String bizSpDid   = "did:omn:biz-sp-did...";   // Biz-SP DID
	    String walletPath = "/path/to/bizsp.wallet";
	    String walletPin  = "테스트용PIN";
	    
	    // 2. 테스트용 nonce 생성 (Biz-SP DB에 insert할 것)
	    String testNonce  = UUID.randomUUID().toString();
	    String testTrxId  = "TEST-" + System.currentTimeMillis();
	    
	    // 3. SDK로 VP 생성 (SDK 클래스명은 실제 것으로 교체)
	    //VpBuilder builder = new VpBuilder();
	    //builder.setHolder("did:omn:test-holder...");
	    //builder.setNonce(testNonce);
	    //builder.setDomain(bizSpDid);
	    // builder.addVerifiableCredential(vc);  // VC 추가
	    
	    //String vpJson = builder.build();
	    
	    // 4. Biz-SP WALLET로 서명
	    //String signedVp = WalletManager.sign(vpJson, walletPath, walletPin);
	    
	    // 5. Biz-SP DB에 직접 insert
	    // INSERT INTO tb_trx_info (trx_id, nonce, vp_data, ...) 
	    // VALUES (testTrxId, testNonce, signedVp, ...)
	    
	    //System.out.println("생성된 VP: " + signedVp);
	}

}
