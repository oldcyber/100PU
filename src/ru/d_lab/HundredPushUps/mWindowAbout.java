package ru.d_lab.HundredPushUps;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

class mWindowAbout {
    public static Dialog makeDialog(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.about, null);
        AlertDialog dialog = new AlertDialog.Builder(context)
        //		TODO: Придумать иконку для приложения
        //        .setIcon(R.drawable.100pushup_icon)
                .setTitle(context.getResources().getString(R.string.app_name))
                .setView(view)
                .setNegativeButton(R.string.legal,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                //TODO: А нужно ли про лицензию???
                                dialog.dismiss();
                            }
                        })
                .setPositiveButton(android.R.string.ok, null)
                .create();

        TextView copyright = (TextView) view.findViewById(R.id.copyright);
        copyright.setText(R.string.copyright);

        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            TextView build = (TextView) view.findViewById(R.id.build);
            build.setText(context.getResources().getString(R.string.version)+" " + pi.versionName + context.getResources().getString(R.string.build)+" " + Integer.toString(pi.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
//             TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dialog;
    }
}
