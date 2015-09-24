package com.jakewharton.sdkmanager.util

class PathFixer {
    static String fixPath(String path) {
        return path.replaceAll(/\\+/, '/');
    }
}
