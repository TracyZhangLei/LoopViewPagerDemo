##LoopingViewPager demo

###Warning
you should use LoopViewPager.setAdapter() always,even through mPagerAdapter.notifyDataSetChanged() is recommendded as usual when data changed</br>
应该使用LoopViewPager.setAdapter()代替mPagerAdapter.notifyDataSetChanged(),不能像通常我们所用的那样，否则会引起崩溃

a real looping viewpager,fix 2 bugs（[issue#22](https://github.com/imbryk/LoopingViewPager/issues/22)  [issue#11](https://github.com/imbryk/LoopingViewPager/issues/11)） from [LoopingViewPager](https://github.com/imbryk/LoopingViewPager)</br></br>
无限循环的ViewPager，修复了LoopingViewPager的2个bug（[issue#22 一个item时禁止滑动](https://github.com/imbryk/LoopingViewPager/issues/22) [issue#11 滑动闪烁](https://github.com/imbryk/LoopingViewPager/issues/11)）

![demo gif](https://github.com/TracyZhangLei/LoopViewPager/blob/master/screen_record.gif)
