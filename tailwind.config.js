/** @type {import('tailwindcss').Config} */
const plugin = require("tailwindcss/plugin");

export default {
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    extend: {
      backgroundImage: {
        "home-office": "url('./src/main/static/public/homeOF.jpg')",
        about: "url('./src/main/static/public/about.jpg')",
        banner: "url('./src/main/static/public/office5.jpg')",
        // "white-overlay"
      },
      textShadow: {
        sm: "0 1px 2px var(--tw-shadow-color)",
        DEFAULT: "0 2px 4px var(--tw-shadow-color)",
        lg: "0 8px 16px var(--tw-shadow-color)",
      },
      boxShadow: {
        border: "1px 1px 1px 1px rgba(23, 23, 23, 0.03)",
        bigShadow: "2px 2px 2px 2px rgba(23, 23, 23, 0.5)",
        button: "1px 1px 1px 1px rgba(23, 23, 23, 0.3)",
      },
    },
  },
  plugins: [
    plugin(function ({ matchUtilities, theme }) {
      matchUtilities(
        {
          "text-shadow": (value) => ({
            textShadow: value,
          }),
        },
        { values: theme("textShadow") }
      );
    }),
  ],
  variants: {
    extend: {
      display: ["group-hover"],
    },
  },
};
