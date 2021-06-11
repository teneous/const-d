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
package com.syoka.common.http

/**
 * 媒体类型
 *
 * @author syoka
 * @version : HttpMediaConstant.kotlin, v 1.0 2021年06月11日 14时08分
 */
class HttpMediaConstant {

    companion object {
        /**
         * APPLICATION_ATOM_XML_VALUE
         */
        const val APPLICATION_ATOM_XML_VALUE = "application/atom+xml"

        /**
         * APPLICATION_CBOR_VALUE
         */
        const val APPLICATION_CBOR_VALUE = "application/cbor"

        /**
         * APPLICATION_FORM_URLENCODED_VALUE
         */
        const val APPLICATION_FORM_URLENCODED_VALUE = "application/x-www-form-urlencoded"

        /**
         * APPLICATION_JSON_VALUE
         */
        const val APPLICATION_JSON_VALUE = "application/json"

        /**
         * APPLICATION_JSON_UTF8_VALUE
         */
        const val APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8"

        /**
         * APPLICATION_PDF_VALUE
         */
        const val APPLICATION_PDF_VALUE = "application/pdf"

        /**
         * APPLICATION_XML_VALUE
         */
        const val APPLICATION_XML_VALUE = "application/xml"

        /**
         * APPLICATION_XAML_XML
         */
        const val APPLICATION_XAML_XML = "application/xaml+xml"

        /**
         * MULTIPART_FORM_DATA_VALUE
         */
        const val MULTIPART_FORM_DATA_VALUE = "multipart/form-data"

        /**
         * MULTIPART_MIXED_VALUE
         */
        const val MULTIPART_MIXED_VALUE = "multipart/mixed"

        /**
         * TEXT_HTML_VALUE
         */
        const val TEXT_HTML_VALUE = "text/html"

        /**
         * TEXT_HTML_UTF8_VALUE
         */
        const val TEXT_HTML_UTF8_VALUE = "text/html;charset=utf-8"

        /**
         * TEXT_PLAIN_VALUE
         */
        const val TEXT_PLAIN_VALUE = "text/plain"
    }
}
