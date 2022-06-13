// Copyright © 2017-2021 Trust Wallet.
//
// This file is part of Trust. The full Trust copyright notice, including
// terms governing use, modification, and redistribution, is contained in the
// file LICENSE at the root of the source code distribution tree.

package com.trustwallet.core.app.blockchains.energywebtoken

import com.google.protobuf.ByteString
import com.trustwallet.core.app.utils.Numeric
import com.trustwallet.core.app.utils.toHexByteArray
import com.trustwallet.core.app.utils.toHexBytes
import com.trustwallet.core.app.utils.toHexBytesInByteString
import org.junit.Assert.assertEquals
import org.junit.Test
import wallet.core.jni.EnergyWebTokenSigner
import wallet.core.jni.proto.EnergyWebToken

class TestEnergyWebTokenSigner {

    init {
        System.loadLibrary("TrustWalletCore")
    }

    @Test
    fun EnergyWebTokenTransactionSigning() {
        // TODO: Finalize implementation

        //val transfer = EnergyWebToken.TransferMessage.newBuilder()
        //    .setTo("...")
        //    .setAmount(...)
        //    ...
        //    .build()
        //val signingInput = EnergyWebToken.SigningInput.newBuilder()
        //    ...
        //    .build()

        //val output: EnergyWebToken.SigningOutput = EnergyWebTokenSigner.sign(signingInput)

        //assertEquals(
        //    "__EXPECTED_RESULT_DATA__",
        //    Numeric.toHexString(output.encoded.toByteArray())
        //)
    }
}
