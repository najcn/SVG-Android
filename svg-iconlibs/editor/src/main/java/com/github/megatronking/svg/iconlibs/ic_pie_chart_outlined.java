package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_pie_chart_outlined extends SVGRenderer {

    public ic_pie_chart_outlined(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 2.0f);
        mPath.cubicTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        mPath.rCubicTo(0.0f, 5.5f, 4.5f, 10.0f, 10.0f, 10.0f);
        mPath.rCubicTo(5.5f, 0.0f, 10.0f, -4.5f, 10.0f, -10.0f);
        mPath.cubicTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 2.0f);
        mPath.rMoveTo(1.0f, 2.07f);
        mPath.rCubicTo(3.61f, 0.45f, 6.48f, 3.33f, 6.93f, 6.93f);
        mPath.lineTo(13.0f, 11.0f);
        mPath.lineTo(13.0f, 4.07f);
        mPath.close();
        mPath.moveTo(13.0f, 4.0699997f);
        mPath.moveTo(4.0f, 12.0f);
        mPath.rCubicTo(0.0f, -4.06f, 3.07f, -7.44f, 7.0f, -7.93f);
        mPath.rLineTo(0f, 15.87f);
        mPath.rCubicTo(-3.93f, -0.5f, -7.0f, -3.88f, -7.0f, -7.94f);
        mPath.close();
        mPath.moveTo(4.0f, 12.0f);
        mPath.rMoveTo(9.0f, 7.93f);
        mPath.lineTo(13.0f, 13.0f);
        mPath.rLineTo(6.93f, 0f);
        mPath.rCubicTo(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f);
        mPath.close();
        mPath.moveTo(13.0f, 19.93f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}