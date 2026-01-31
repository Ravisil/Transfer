# Upload API Instructions

This document describes how to upload files to `tmpfiles.org` via the command line, as performed during the build process.

## 1. API Endpoint
The service provides a simple upload API:
- **URL**: `https://tmpfiles.org/api/v1/upload`
- **Method**: `POST`
- **Content-Type**: `multipart/form-data`

## 2. Upload Command
Use `curl` to upload the file. Replace `<path_to_apk>` with the actual path to your file.

```bash
curl -F "file=@<path_to_apk>" https://tmpfiles.org/api/v1/upload
```

**Example:**
```bash
curl -F "file=@app/build/outputs/apk/release/app-release.apk" https://tmpfiles.org/api/v1/upload
```

## 3. Response Format
The API returns a JSON object containing the URL of the uploaded file.

**Example Response:**
```json
{
  "status": "success",
  "data": {
    "url": "https://tmpfiles.org/21847313/app-release.apk"
  }
}
```

## 4. Getting the Download Link
The URL returned in the JSON response is the **page URL**, not the direct download link. To get the direct download link, you must modify the URL by adding `/dl/` after the domain name.

- **Page URL**: `https://tmpfiles.org/21847313/app-release.apk`
- **Direct Link**: `https://tmpfiles.org/dl/21847313/app-release.apk`

This direct link can be used to download the file immediately.
