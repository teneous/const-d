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
 *Http扩展头元素
 *
 * @author syoka
 * @version : HttpExtendConstant.kotlin, v 1.0 2021年06月11日 00时10分
 */
class HttpExtendConstant {
    companion object {
        /**
         * 认证头元素
         */
        const val AUTHORIZATION = "Authorization"

        /**
         * redirect:
         */
        const val REDIRECT_COLON = "redirect:"

        /**
         * forward:
         */
        const val FORWARD_COLON = "forward:"

        /**
         *token 持有前缀
         */
        const val BEARER = "bearer:"
    }
}
