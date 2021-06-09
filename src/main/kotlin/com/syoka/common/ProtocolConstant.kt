/**
 * MIT License
 *
 * Copyright (c) 2021 syoka
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.syoka.common

/**
 * 常见协议常量
 *
 * @author syoka
 * @version : ProtocolConstant.kotlin, v 1.0 2021年06月09日 18时46分
 */
class ProtocolConstant {
    companion object {

        /**
         * Http
         */
        const val HTTP = "com/syoka/common/http"
        const val HTTP_PORT = "80"

        /**
         * Https
         */
        const val HTTPS = "https"
        const val HTTPS_PORT = "443"

        /**
         * SMTP 邮件
         */
        const val SMTP = "smtp"
        const val SMTP_PORT = "25"

        /**
         * pop3
         */
        const val POP3 = "pop3"
        const val POP3_PORT = "110"

        /**
         * imap
         */
        const val IMAP = "imap"
        const val IMAP_PORT = "143"

        /**
         * ssh
         */
        const val SSH = "ssh"
        const val SSH_PORT = "22"

        /**
         * ftp
         */
        const val FTP = "ftp"
        const val FTP_PORT = "21"
    }
}
