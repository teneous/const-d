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
package kotlin.com.syoka.common.http

/**
 * http头元素常量
 *
 * @author syoka
 * @version : HttpHeaderConstant.kotlin, v 1.0 2021年06月11日 00时08分
 */
class HttpHeaderConstant {
    companion object {
        /**
         * Specifies the domain name of the server (for virtual hosting),
         * and (optionally) the TCP port number on which the server is listening.
         * 服务地址和端口
         */
        const val HOST = "Host"

        /**
         * The address of the previous web page from which a link to the currently requested page was followed.
         * 跳转来源
         */
        const val REFERER = "Referer"

        /**
         * 来源经过的代理链路
         * <proxy1>--><proxy2>--><proxy3>
         * X-Forwarded-For: 203.0.113.195, 70.41.3.18, 150.172.238.178
        </proxy3></proxy2></proxy1> */
        const val X_FORWARDED_HOST = "X-Forwarded-Host"

        /**
         * 允许接受的MIME type
         */
        const val ACCEPT = "Accept"

        /**
         * 支持的标题字符编码
         */
        const val ACCEPT_CHARSET = "Accept-Charset"

        /**
         * 支持的标题语言
         */
        const val ACCEPT_LANGUAGE = "Accept-Language"

        /**
         * 缓存控制
         */
        const val CACHE_CONTROL = "Cache-Control"

        /**
         * 内容编码 gzip
         */
        const val CONTENT_ENCODING = "Content-Encoding"

        /**
         * 客户端返回的内容类型
         */
        const val CONTENT_TYPE = "Content-Type"

        /**
         * 客户端返回的字节长度
         */
        const val CONTENT_LENGTH = "Content-Length"

        /**
         * 用户代理 Mozilla/5.0
         */
        const val USER_AGENT = "User-Agent"

        /**
         * 日期/时间过后，相应为失效
         */
        const val EXPIRE = "Expires"

        /**
         * 连接类型keep-alive
         */
        const val CONNECTION = "Connection"

        /**
         * Cookie头
         */
        const val COOKIE = "Cookie"

        /**
         *
         */
        const val X_REQUESTED_WITH = "X-Requested-With"

        /**
         * HTTP or HTTPS 确定客户端和LB之间的协议
         */
        const val X_FORWARDED_PROTO = "X-Forwarded-Proto"

        /**
         *
         */
        const val X_FORWARDED_PORT = "X-Forwarded-Port"

        /**
         * XMLHttpRequest
         */
        const val XML_HTTP_REQUEST = "XMLHttpRequest"
        /**
         *
         */
        const val X_REAL_IP = "X-Real-Ip"

        const val APPLICATION_ATOM_XML_VALUE = "application/atom+xml"

        const val APPLICATION_CBOR_VALUE = "application/cbor"

        const val APPLICATION_FORM_URLENCODED_VALUE = "application/x-www-form-urlencoded"

        const val APPLICATION_JSON_VALUE = "application/json"

        const val APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8"

        const val APPLICATION_PDF_VALUE = "application/pdf"

        const val APPLICATION_XML_VALUE = "application/xml"

        const val APPLICATION_XAML_XML = "application/xaml+xml"

        const val MULTIPART_FORM_DATA_VALUE = "multipart/form-data"

        const val MULTIPART_MIXED_VALUE = "multipart/mixed"

        const val TEXT_HTML_VALUE = "text/html"

        const val TEXT_HTML_UTF8_VALUE = "text/html;charset=utf-8"

        const val TEXT_PLAIN_VALUE = "text/plain"

        const val ACCEPT_REGULAR_EXPRESS = "*/*"
    }
}
