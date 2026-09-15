package edu.temple.inclassuiactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _fonts: Array<Int>) : BaseAdapter() {
//    Assigning _context to a value and fonts
    private val context = _context
    private val fonts = _fonts

    override fun getCount(): Int {
        return fonts.size
    }

    override fun getItem(position: Int): Any {
        return fonts[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) = (if(convertView==null)
                TextView(context)
            else {
        convertView as TextView
    }).apply{
                    text = fonts[position].toString()
                    textSize = 22f
    }

//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
////        val textView = TextView(context)
////        textView.text = fonts[position].toString()
////        textView.textSize = fonts[position].toFloat()
//
//        val textView = if(convertView==null)
//            TextView(context)
//        else{
//            (convertView as TextView)}
//        textView.text = fonts[position].toString()
//        textView.textSize = 22f
//
//        return textView
//    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val textView = (getView(position,convertView,parent) as TextView)
        textView.textSize = fonts[position].toFloat()

        return textView
    }

}