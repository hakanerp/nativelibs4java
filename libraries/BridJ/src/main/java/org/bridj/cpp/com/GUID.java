/*
 * BridJ - Dynamic and blazing-fast native interop for Java.
 * http://bridj.googlecode.com/
 *
 * Copyright (c) 2010-2015, Olivier Chafik (http://ochafik.com/)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Olivier Chafik nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY OLIVIER CHAFIK AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.bridj.cpp.com;

import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;

/**
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a
 * href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Runtime(CRuntime.class)
public class GUID extends StructObject {

    @Field(0)
    public int Data1() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GUID Data1(int Data1) {
        this.io.setIntField(this, 0, Data1);
        return this;
    }

    public final int Data1_$eq(int Data1) {
        Data1(Data1);
        return Data1;
    }

    @Field(1)
    public short Data2() {
        return this.io.getShortField(this, 1);
    }

    @Field(1)
    public GUID Data2(short Data2) {
        this.io.setShortField(this, 1, Data2);
        return this;
    }

    public final short Data2_$eq(short Data2) {
        Data2(Data2);
        return Data2;
    }

    @Field(2)
    public short Data3() {
        return this.io.getShortField(this, 2);
    }

    @Field(2)
    public GUID Data3(short Data3) {
        this.io.setShortField(this, 2, Data3);
        return this;
    }

    public final short Data3_$eq(short Data3) {
        Data3(Data3);
        return Data3;
    }
    /// C type : unsigned char[8]

    @Array({8})
    @Field(3)
    public Pointer<Byte> Data4() {
        return this.io.getPointerField(this, 3);
    }
}
