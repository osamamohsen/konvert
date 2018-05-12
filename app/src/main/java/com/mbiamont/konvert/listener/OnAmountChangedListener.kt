package com.mbiamont.konvert.listener

/**
 * Listener to be aware when the user require an amount change
 */
interface OnAmountChangedListener {

    /**
     * Function called when the user changed the amount for the given currency symbol.
     *
     */
    fun onAmountChanged(symbol: String, amount: Float)
}