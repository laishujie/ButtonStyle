# ButtonStyle
圆角,椭圆等按钮,不用再写shape文件。Rounded corners, oval buttons, no need to write shape files

### Step 1
#### Gradle
```
dependencies {
      compile 'com.lai:buttonStyle:1.0.0'
}
```

### Step 2

#### 在布局上/In Layout

```
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
   >
   
    <com.lai.library.ButtonStyle
        android:id="@+id/activity_btn_1"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:text="@string/app_name"
        app:normal_color="#F1F1F1"
        app:press_color="#E9EEF2"
        app:stroke_color="#CCCDD0"
        app:stroke_width="1dp"/>
 
 </LinearLayout>

```
#### 预览/preview

![image](https://github.com/laishujie/ButtonStyle/raw/master/20170612143010.png)


#### XML 属性 /XML Attribute 
<table>
  <tdead>
    <tr>
      <th align="center">属性/Attribute</th>
      <th align="center">介绍/introduce</th>
    </tr>
  </tdead>
  <tbody>
   <tr>
      <td align="center">type</td>
      <td align="center">根据固定的值快速配置出按钮: ok,info,warning,error</td>
    </tr>
    <tr>
      <td align="center">normal_color</td>
      <td align="center">默认颜色 /Default color</td>
    </tr>
    <tr>
      <td align="center">press_color</td>
      <td align="center">按下颜色/Press color</td>
    </tr>
    <tr>
      <td align="center">stroke_color</td>
      <td align="center">边框颜色 / stroke color</td>
    </tr>
    <tr>
      <td align="center">stroke_width</td>
      <td align="center">边框宽度 / stroke width</td>
    </tr>
    <tr>
      <td align="center">corner</td>
      <td align="center">圆角大小 / corner size</td>
    </tr>
  </tbody>
</table>

##### 方法 Main Method
setPressedColor setNormalColor setCurrCorner  setStrokeWidth setStrokeColor
