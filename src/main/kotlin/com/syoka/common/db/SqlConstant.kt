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
package com.syoka.common.db

/**
 * sql pool
 *
 * @author syoka
 * @version : SqlConstant.kotlin, v 1.0 2021年06月09日 18时38分
 */
class SqlConstant {

    companion object {

        /**
         * select
         */
        const val SELECT = "select"

        /**
         * delete
         */
        const val DELETE = "delete"

        /**
         * update
         */
        const val UPDATE = "update"

        /**
         * insert
         */
        const val INSERT = "insert"

        /**
         * from
         */
        const val FROM = "from"

        /**
         * where
         */
        const val WHERE = "where"

        /**
         * order by
         */
        const val ORDER_BY = "order by"

        /**
         * group by
         */
        const val GROUP_BY = "group by"

        /**
         * desc
         */
        const val DESC = "desc"

        /**
         * asc
         */
        const val ASC = "asc"

        /**
         * on
         */
        const val ON = "on"

        /**
         * distinct
         */
        const val DISTINCT = "distinct"

        /**
         * left join
         */
        const val LEFT_JOIN = "left join"

        /**
         * right join
         */
        const val RIGHT_JOIN = "right join"

        /**
         * inner join
         */
        const val INNER_JOIN = "inner join"

        /**
         * cross join
         */
        const val CROSS_JOIN = "cross join"

        /**
         * union
         */
        const val UNION = "union"

        /**
         * union all
         */
        const val UNION_ALL = "union all"

        /**
         * limit
         */
        const val LIMIT = "limit"

        /**
         * limit 1
         */
        const val LIMIT_1 = "limit 1"

        /**
         * alter
         */
        const val ALTER = "alter"

    }
}
