import {resolve} from 'path'
import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

const root = resolve(__dirname, 'src/main/js')

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  base: '',

  build: {
    outDir: 'src/main/js/',
    rollupOptions: {
      input: {
        main: resolve(root, 'index.html'),
      }
    }
  }
})
